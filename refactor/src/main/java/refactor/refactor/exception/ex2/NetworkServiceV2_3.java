package refactor.refactor.exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("data = " + e.getErrorCode() + e.getMessage());
        } finally {
            client.disconnect();
        }


    }
}
