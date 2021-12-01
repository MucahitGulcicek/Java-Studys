public interface HttpInsterface {
    public void request(String a);
    public void onSuccess(String message);
    public void onError(String message);
    public void onTimeout(String message);

}
