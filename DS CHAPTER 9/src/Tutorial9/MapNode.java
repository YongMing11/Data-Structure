/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial9;

/**
 *
 * @author Forge-15 1650
 */
public class MapNode<K, V> {

    private K key;
    private V value;
    private MapNode link;

    public MapNode(K key, V value, MapNode link) {
        this.key = key;
        this.value = value;
        this.link = link;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MapNode getLink() {
        return link;
    }

    public void setLink(MapNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return key + " : " + value + " --> ";
    }

}
