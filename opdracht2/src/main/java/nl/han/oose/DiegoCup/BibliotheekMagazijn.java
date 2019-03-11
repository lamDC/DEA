package nl.han.oose.DiegoCup;

import nl.han.oose.DiegoCup.exceptions.TitelAlreadyInUseException;
import nl.han.oose.DiegoCup.exceptions.TitelIsEmptyException;

import java.util.List;

public class BibliotheekMagazijn {

    private List<BibliotheekItem> items;

    public BibliotheekMagazijn(List<BibliotheekItem> items) {

        this.items = items;
    }

    public BibliotheekItem pakItem(String titel){
        BibliotheekItem gevondenItem = null;

        for(BibliotheekItem item : items){
            if(titel.equals(item.getTitel())){
                gevondenItem = item;
                break;
            }
        }
        items.remove(gevondenItem);

        return gevondenItem;
    }

    public void plaatsItem(BibliotheekItem item) throws TitelIsEmptyException, TitelAlreadyInUseException {
        if("".equals(item.getTitel())){
            throw new TitelIsEmptyException();
        }
        else if(item.getTitel() == null){
            throw new TitelIsEmptyException();
        }
        else {
            for(BibliotheekItem gekozenItem : items){
                if(item.getTitel().equals(gekozenItem.getTitel())){
                    throw new TitelAlreadyInUseException();
                }
            }
            items.add(item);
        }
    }

    public int getAantalBibliotheekItems() {
        return items.size();
    }

}

