public class Main 
{
    public static void main(String[] args) 
    {
        double investment=100000.0; 
        double growthRate=0.08;     
        int years=5;
        System.out.println("FINANCIAL FORECASTING TOOL");
        System.out.println("Initial Investment : Rs." + investment);
        System.out.println("Annual Growth Rate : " + (growthRate * 100) + "%");
        System.out.println("Forecast Period : " + years + " years");
        System.out.println("\n RECURSIVE APPROACH ");
        System.out.println("(Traces the recursion stack)");
        double recursiveResult=FinancialForecaster.futureValueRecursive(investment,growthRate,years);
        System.out.printf("Final Value (Recursive): Rs.%.2f%n", recursiveResult);
        System.out.println("\n ITERATIVE APPROACH ");
        double iterativeResult=FinancialForecaster.futureValueIterative(investment,growthRate,years);
        System.out.printf("Final Value (Iterative): Rs.%.2f%n",iterativeResult);
        System.out.println("\n MEMOIZED (OPTIMIZED) APPROACH ");
        FinancialForecaster.resetMemo();
        double memoResult=FinancialForecaster.futureValueMemoized(investment,growthRate,years, years);
        System.out.printf("Final Value (Memoized) : Rs.%.2f%n",memoResult);
        FinancialForecaster.printGrowthTable(investment,growthRate,years);
        System.out.println("\n COMPLEXITY ANALYSIS ");
        System.out.println("Recursive (basic):");
        System.out.println("  Time : O(n) — one call per year");
        System.out.println("  Space: O(n) — n frames on call stack");
        System.out.println("  Risk : Stack overflow for very large n");
        System.out.println("\nIterative:");
        System.out.println("  Time : O(n) — one loop per year");
        System.out.println("  Space: O(1) — no call stack used");
        System.out.println("  Best for: large n values");
        System.out.println("\nMemoized Recursive:");
        System.out.println("  Time : O(n) — each year computed only once");
        System.out.println("  Space: O(n) — memo array + call stack");
        System.out.println("  Best for: overlapping subproblems");
        System.out.println("\n  RECOMMENDATION: Use Iterative for financial");
        System.out.println("  forecasting — O(1) space, no stack overflow risk.");
    }
}