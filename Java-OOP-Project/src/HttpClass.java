public class HttpClass implements HttpInsterface{

    @Override
    public void request(String a) {
        if(a.equals("a")){
            onSuccess("Message");
        }
    }

    @Override
    public void onSuccess(String message) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void onTimeout(String message) {

    }
}
