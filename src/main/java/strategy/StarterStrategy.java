package strategy;
//wzorzec BEHAWIORALNY
//stosujemy gdy mamy sporo instrukcji warunkowych, poprzez stworzenie interfejsu, ktory implementuje kazda z metod
//wspiera zasade SOLID close Open.
//Bardzo często gdy piszemy kod programu staje się on coraz bardziej złożony. Szczególnie ma to miejsce jeśli w naszym kodzie mamy
// dużo instrukcji warunkowych. Pomiędzy warunkami tych instrukcji powstają bloki kodu. Im więcej takich bloków tym kod jest mniej czytelny.
// Sprawia to, że utrzymanie takiego kodu jest trudne.
//
//Wzorzec strategia pozwala rozwiązać ten problem. Odbywa się to przez wydzielenie wspólnej abstrakcji dla wszystkich tych bloków.
// Tę abstrakcje opisuje się za pomocą interfejsu. Natomiast zawartość każdego z bloków to osobny algorytm. Każdy z nich trafia do osobnej klasy.
public class StarterStrategy {
    private static final String TEXT = "Strategy Design Pattern";

    public static void main(String[] args) {
        FormatterContex context = new FormatterContex();

        context.set(new CapitalizeFormatter());
        context.print(TEXT);

        context.set(new UpperCaseFormatter());
        context.print(TEXT);

        context.set(new LowerCaseFormatter());
        context.print(TEXT);
    }
}
