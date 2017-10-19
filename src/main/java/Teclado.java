public class Teclado {
    public Boolean ehAlex(String s) {
        return "1#444#22#88".equals(s);
    }

    public Boolean ehHyan(String s) {
        return "33#888#1#55".equals(s);
    }

    public Boolean retornaH(String s){
        return "33".equals(s);
    }

    public Boolean retornaDouglas(String s){
        return "2#555#77#3#444#1#6666".equals(s);
    }


    public String verificaAlfabeto(String s){

        String digitos[] = s.split("#");
        String a = "";
        for (int i = 0;i<digitos.length;i++) {

            switch(digitos[i]) {
                    case "1":
                        a+="a";
                        break;

                    case "11":
                        a+="b";
                        break;
            }

        }
        return a;

    }

    public String decodifica(String s) {

        if(ehAlex(s)) {
            return "alex";
        }
        if(ehHyan(s)) {
            return "hyan";
        }
        if(retornaH(s)){
            return "h";
        }
        if (retornaDouglas(s)){
            return "douglas";
        }else {
            String digitos[] = s.split("#");
            String a = "";
            for (int i = 0;i<digitos.length;i++) {

                switch(digitos[i]) {
                    case "1":
                        a+="a";
                        break;
                    case "11":
                        a+="b";
                        break;
                    case "111":
                        a+="c";
                        break;
                    case "2":
                        a+="d";
                        break;
                    case "22":
                        a+="e";
                        break;
                    case "222":
                        a+="f";
                        break;
                    case "3":
                        a+="g";
                        break;
                    case "33":
                        a+="h";
                        break;
                    case "333":
                        a+="i";
                        break;
                    case "4":
                        a+="j";
                        break;
                    case "44":
                        a+="k";
                        break;
                    case "444":
                        a+="l";
                        break;
                    case "5":
                        a+="m";
                        break;
                    case "55":
                        a+="n";
                        break;
                    case "555":
                        a+="o";
                        break;
                    case "6":
                        a+="p";
                        break;
                    case "66":
                        a+="q";
                        break;
                    case "666":
                        a+="r";
                        break;
                    case "6666":
                        a+="s";
                        break;
                    case "7":
                        a+="t";
                        break;
                    case "77":
                        a+="u";
                        break;
                    case "777":
                        a+="v";
                        break;
                    case "8":
                        a+="w";
                        break;
                    case "88":
                        a+="x";
                        break;
                    case "888":
                        a+="y";
                        break;
                    case "8888":
                        a+="z";
                        break;
                    case "0":
                        a+=" ";
                }

            }
            return a;
        }

    }
}
