package competetiveC;

public class Primzahlen{


  /**
  Hier wird eine Beliebige Zahl x überprüft.
  @param x Die zu überprüfende Zahl
  @param y Der Teiler
  @return Die Primzahl oder 0;
  **/
  private int istTeilbar(int x, int y)
  {
    int tmp = x%y;
    if(tmp > 0)
    {
      return tmp;
    }
    return 0;
  }

  /**
  Hier wird überprüft ob die Zahl x eine Primzahl ist.

  @param eine Zahl
  @return ist Primzahl = true, ist keine Primzahl = false
  **/
  public boolean istPrimzahl(int x){
    for(int i = 2; i < x; i++)
    {
      if (istTeilbar(x, i) == 0)
      {
          return false;
      }
    }
    return true;
  }

  public void schreibePrimzahlbis(int grenze)
  {
    int primecnt = 0;
    for(int i = 2; i <= grenze; i++)
    {
        if (istPrimzahl(i) == true)
        {
          primecnt++;
          //System.out.println(i);
        }
    }
    System.out.println("Es existieren " + primecnt + " Primezahlen");
  }



  public static void main(String[] args) {

    Primzahlen obj = new Primzahlen();
    //System.out.println(obj.istPrimzahl(20000));
    System.out.println("");
    obj.schreibePrimzahlbis(100000);
  }
}
