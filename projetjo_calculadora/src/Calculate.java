public class Calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        double v = Integer.parseInt(args[1]);
        double w = Integer.parseInt(args[2]);

        if(args[0].equals("somar")){ sum(x, y);
        }else if(args[0].equals("Subtrair")){ minus(x, y);
        } else if (args[0].equals("multiplicar")) { multiply(x, y);
        } else if (args[0].equals("dividir")) { divide(v, w);
        }else { System.out.println("Augumentos inválidos");
        }
    }

    static void sum(int x, int y){ System.out.println(x + y); }

    static void minus(int x, int y){ System.out.println(x - y); }

    static void multiply(int x, int y){ System.out.println(x * y); }

    static void divide(double v, double w){ System.out.println(v / w); }
}
