package HashMap;

import javax.imageio.plugins.tiff.TIFFDirectory;
import javax.swing.text.html.parser.Entity;

public class Hashmap {
    private Entity[] entities;

    Hashmap(){
        this.entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode()% entities.length);
        entities[hash] = new Entity(key,value);

    }

    public String get(String key){
        int hash = Math.abs(key.hashCode()% entities.length);
        if (entities[hash]!= null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public String remove(String key){
        int hash = Math.abs(key.hashCode()% entities.length);
        String x = "";
        if (entities[hash]!= null && entities[hash].key.equals(key)){
            x = entities[hash].value;
            entities[hash] = null;
        }
        return x;
    }


    private class Entity {
        private String key;
        private String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
