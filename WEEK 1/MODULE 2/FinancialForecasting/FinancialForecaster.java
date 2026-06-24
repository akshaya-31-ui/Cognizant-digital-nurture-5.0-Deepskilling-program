public class FinancialForecaster 
{
    public static double futureValueRecursive(double presentValue,double growthRate,int years) 
    {
        if(years==0) 
        {
            return presentValue;
        }
        System.out.println("Year " + years
            + " remaining → current value: Rs."
            + String.format("%.2f",presentValue));
        return futureValueRecursive(presentValue*(1+growthRate),growthRate,years-1);
    }
    public static double futureValueIterative(double presentValue,double growthRate,int years) 
    {
        double value=presentValue;
        for(int i=1;i<=years;i++) 
        {
            value=value*(1+growthRate);
            System.out.println("  Year " + i + ": Rs." + String.format("%.2f", value));
        }
        return value;
    }
    private static double[] memo;
    public static double futureValueMemoized(double presentValue,double growthRate,int totalYears,int yearsLeft) 
    {
        if(memo==null) 
        {
            memo=new double[totalYears+1];
            memo[totalYears]=presentValue; 
        }
        if(yearsLeft==0) 
        {
            return memo[totalYears];
        }
        int yearIndex=totalYears-yearsLeft+1;
        if(memo[yearIndex]!=0) 
        {
            System.out.println("[Cache] Year " + yearIndex+ " already computed: Rs." + String.format("%.2f",memo[yearIndex]));
            return memo[yearIndex];
        }
        double prevValue=futureValueMemoized(presentValue,growthRate,totalYears,yearsLeft-1);
        memo[yearIndex]=prevValue*(1+growthRate);
        System.out.println("[Computed] Year " + yearIndex + ": Rs." + String.format("%.2f",memo[yearIndex]));
        return memo[yearIndex];
    }
    public static void resetMemo() 
    { 
        memo=null; 
    }
    public static void printGrowthTable(double initialInvestment,double annualGrowthRate,int years) 
    {
        System.out.println("\n INVESTMENT GROWTH TABLE ");
        System.out.printf("%-6s %-18s %-18s%n","Year", "Value (Rs.)", "Profit (Rs.)");
        System.out.println("-".repeat(42));
        double value=initialInvestment;
        for (int year=0;year<=years;year++) 
        {
            System.out.printf("%-6d Rs.%-15.2f Rs.%.2f%n",year,value,value-initialInvestment);
            value*=(1+annualGrowthRate);
        }
        System.out.println("=".repeat(42));
    }
}