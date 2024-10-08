 
public class Methoden {

    public static int round(int number){
        // TODO: implementiere hier deine Lösung für a)
        return ((number + 50) / 100) * 100 ;
    }

    public static void hours(int seconds){
        // TODO: implementiere hier deine Lösung für b
        int hours = seconds / 3600 ; 
        int minutes = (seconds % 3600) / 60 ;
        seconds = seconds % 60 ; 
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    
    // TODO: Schreibe hier eine Methode für die Aufgabe c)
    public static void sort(int a, int b, int c) {
      if (b<a && c<b) {
        System.out.println(c + " " + b + " " + a);
       } else if (a<b && c<a) {
            System.out.println(c + " " + a + " " + b);
       } else if (b<c && a<b ) {
        System.out.println(a + " " + b + " "+ c);
       } else if (c<b && a<c) {
        System.out.println( a + " " + c + " " + b);
       } else if (a<c && b<a) {
        System.out.println(b + " " + a + " "+ c);
       } else if ( c<a && b<c ){
        System.out.println(b + " " + c + " " + a);  
       } else if ( a==b && b==c){
        System.out.println(a + " " + b + " " + c);
       }else if ( b==c && a<b ){
        System.out.println(a + " " + b + " " + c);
      } else {
        System.out.println( "not handled: " + a + " " + b + " " + c);
      }
    }
    
    public static double distance(double x1, double y1, double x2, double y2){
        // TODO: implementiere hier deine Lösung für d)
        return (Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2))) ;
    }

        public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(round(149));
        System.out.println(round(150));
        System.out.println(round(-50));
        System.out.println(round(-49));
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        hours(7300);
        hours(1234);
        hours(60);
        hours(100);
        hours(0);
        // TODO: Schreibe Testcode für die Aufgabe

        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        // Test-Code ent-kommentieren, sobald die Funktion programmiert ist
        sort(1, 2, 3);
        sort(1, 3, 2);
        sort(2, 1, 3);
        sort(2, 3, 1);
        sort(3, 1, 2);
        sort(3, 2, 1);
        sort(1, 3, 3);
        sort(-1, -1, -1);
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println(distance( 3, 4, 5, 6));
        System.out.println(distance( 2, 2, 4, 4));
        System.out.println(distance(5, 3, 7, 2));
    }
    
}
