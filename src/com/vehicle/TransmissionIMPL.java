public class TransmissionImpl {
    public static void main( String[] args) {

        Manual m1 = new Manual("MP4", "Manual");
        m1.showSpecification();
        AMT a1=new AMT("AMTP5","AMTP");
        a1.showSpecification();

    }

    private static class AMT {
        public AMT(String amtp5, String amtp) {
        }

        public void showSpecification() {
        }
    }
}
