/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL2;

/**
 *
 * @author Forge-15 1650
 */
public class SpecialEncoding<T> {

    T[] obj;
    String[] x;

    public SpecialEncoding(T[] obj) {

        this.obj = obj;
        x = new String[obj.length];
        System.out.print("The Code is ");
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
            x[i] = (obj[i] + "");
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        String str = "The Command is ";
        if (obj[0] instanceof Integer) {
            for (int i = 0; i < obj.length; i++) {
                switch ((Integer) obj[i]) {
                    case (0): {
                        str += "Copy ";
                        break;
                    }
                    case (1): {
                        str += "Delete ";
                        break;
                    }
                    case (2): {
                        str += "Insert ";
                        break;
                    }
                    case (3): {
                        str += "Print ";
                        break;
                    }
                    case (4): {
                        str += "Rename ";
                        break;
                    }
                    case (5): {
                        str += "Paste ";
                        break;
                    }

                }
            }
        } else if (obj[0] instanceof Character) {
            for (int i = 0; i < obj.length; i++) {
                switch ((Character) obj[i]) {
                    case ('C'): {
                        str += "Copy ";
                        break;
                    }
                    case ('D'): {
                        str += "Delete ";
                        break;
                    }
                    case ('I'): {
                        str += "Insert ";
                        break;
                    }
                    case ('P'): {
                        str += "Print ";
                        break;
                    }
                    case ('R'): {
                        str += "Rename ";
                        break;
                    }
                    case ('V'): {
                        str += "Paste ";
                        break;
                    }

                }
            }
        }

//        for (int i = 0; i < obj.length; i++) {
//            if (x[i].equals("0") || x[i].equals("C")) {
//                str += "Copy ";
//            } else if (x[i].equals("1") || x[i].equals("D")) {
//                str += ("Delete ");
//            } else if (x[i].equals("2") || x[i].equals("I")) {
//                str += ("Insert ");
//            } else if (x[i].equals("3") || x[i].equals("P")) {
//                str += ("Print ");
//            } else if (x[i].equals("4") || x[i].equals("R")) {
//                str += ("Rename ");
//            } else if (x[i].equals("5") || x[i].equals("V")) {
//                str += ("Paste ");
//            }
//        }
        return str;
    }

}
