public class Printer implements PrinterInterFace {

    @Override
    public void print() {

        System.out.println(count + "-" + text);
    }
}
