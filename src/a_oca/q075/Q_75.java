package a_oca.q075;

import java.io.IOException;

public class Q_75 {

}

class Test75{
void readCard(int cardNo) throws RuntimeException{
    System.out.println("Reading Card");	//exception hem run time da hemde complie time a bakiyor
}

void checkCard(int cardNo) throws IOException {  // line n1
    System.out.println("Checking Card");
}

public static void main(String[] args) throws IOException {//yukarida yazildigi icin burayada atmak gerek Exception i
    Test75 ex = new Test75();
    int cardNo = 12344;
    ex.readCard(cardNo);   // line n2
    ex.checkCard(cardNo);  // line n3
}
}

/*
compilation fails at line n2
*/
