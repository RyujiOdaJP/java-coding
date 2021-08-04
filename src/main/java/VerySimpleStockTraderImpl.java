public class VerySimpleStockTraderImpl implements IAutomatedStockTrader {

    // 直接IStockAnalysisService, IOnlineBrokerageServiceインタフェースを実装したクラスのインスタンスを作成しており、
    // これらの実装に深く依存してしまっている。
    // 呼び出し元で自由に実装クラスは分けられるべき。
    private final IStockAnalysisService analysisService; //= new StockAnalysisServiceImpl();
    private final IOnlineBrokerageService brokerageService; //= new NewYorkStockExchangeBrokerageServiceImpl();

    //    Interface Injection：
    //    この方法では、インターフェース、つまり土台となるメソッド群を定義し、作成するクラスにそのインターフェースを批准させることで DIを実装します。
    //    Java/ Kotlinでいうと interface、Objective-C/ Swiftでいうと protocol がインターフェースに該当すると思います。
    public VerySimpleStockTraderImpl(
            IStockAnalysisService analysisService,
            IOnlineBrokerageService brokerageService
    ) {
        this.analysisService = analysisService;
        this.brokerageService = brokerageService;
    }

    public void executeTrades() {
        analysisService.getEstimatedValue("tesla");
        brokerageService.getStockSymbols();
    }

    public static class NewYorkStockExchangeBrokerageServiceImpl implements IOnlineBrokerageService {
        @Override
        public String[] getStockSymbols() {
            return new String[0];
        }

        @Override
        public double getBidPrice(String stockSymbol) {
            return 0;
        }

        @Override
        public double getAskPrice(String stockSymbol) {
            return 0;
        }

        @Override
        public void putBuyOrder(String stockSymbol, int shares, double buyPrice) {

        }

        @Override
        public void putSellOrder(String stockSymbol, int shares, double sellPrice) {

        }
    }

    public static class StockAnalysisServiceImpl implements IStockAnalysisService {
        @Override
        public double getEstimatedValue(String stockSymbol) {
            return 0;
        }
    }

}