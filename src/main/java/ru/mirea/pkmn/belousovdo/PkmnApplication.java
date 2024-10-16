package ru.mirea.pkmn.belousovdo;

import ru.mirea.pkmn.Card;

public class PkmnApplication
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        CardImport ci = new CardImport();
        Card c = ci.Import("C:\\Users\\student\\IdeaProjects\\Pkmn\\src\\main\\resources\\my_card.txt");
        System.out.println(c.toString());

        CardExport exporter = new CardExport();
        exporter.saveCardToFile(c);

        CardImport importer = new CardImport();
        Card loadedCard = importer.loadCardFromFile("Pyroar.crd");

        if (loadedCard != null)
        {
            System.out.println("Loaded Card: " + loadedCard);
        }
        else
        {
            System.out.println("Failed to load the card.");
        }
    }
}
