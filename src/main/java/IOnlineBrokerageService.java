public interface IOnlineBrokerageService {
    String[] getStockSymbols();
    double getBidPrice(String stockSymbol);
    double getAskPrice(String stockSymbol);
    void putBuyOrder(String stockSymbol, int shares, double buyPrice);
    void putSellOrder(String stockSymbol, int shares, double sellPrice);
}

interface IStockAnalysisService {
    double getEstimatedValue(String stockSymbol);
}

interface IAutomatedStockTrader {
    void executeTrades();
}
