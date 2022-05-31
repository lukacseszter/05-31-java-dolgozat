/*
* File: dolgozok.java
* Author: Lukács Eszter
* Copyright: 2022, Lukács Eszter 
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/lukacseszter/
* Licenc: GNU GPL
*/

package models;

public class dolgozok {

    public int id;
    public String name;
    public int groupId;

    public dolgozok(int id, String name, int groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }

}
