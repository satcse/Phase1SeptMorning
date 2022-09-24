public class innerClassAdvanced {

    private String msg="Inner Classes";

    void display() {
        class InnerAd {
            String msg() {
                return msg;
            }
        }

        class InnerAd2 {
            void msg2() {
                System.out.println(msg+" from second inner class");
            }
        }

        InnerAd I = new InnerAd();
        String result = I.msg();
        System.out.println(result);

        InnerAd2 I2 = new InnerAd2();
        I2.msg2();
    }

    public static void main(String[] args) {
        innerClassAdvanced ob = new innerClassAdvanced();
        ob.display();
    }
}

