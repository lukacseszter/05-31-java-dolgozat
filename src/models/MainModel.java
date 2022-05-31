/*
* File: MainModel.java
* Author: Lukács Eszter
* Copyright: 2022, Lukács Eszter 
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/lukacseszter/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {

    public beosztas[] groupArray = {
            new beosztas(1, "HR"),
            new beosztas(2, "Főnök"),
            new beosztas(3, "Vizuális felelős"),
            new beosztas(4, "Vágó"),
            new beosztas(5, "Programozó"),
            new beosztas(6, "Takarító"),
            new beosztas(7, "Titkárnő"),
            new beosztas(8, "Titkárfiú"),
            new beosztas(9, "Rendszergazda"),
            new beosztas(10, "Értékesítő"),
            new beosztas(11, "Hangtechikus"),
            new beosztas(12, "Beosztott")
    };
    public Vector<beosztas> groupList = new Vector<>(Arrays.asList(groupArray));

    public dolgozok[] workerArray = {
            new dolgozok(1, "Szabó Ádám", 1),
            new dolgozok(2, "Varga Irén", 10),
            new dolgozok(3, "Nagy Ágota", 5),
            new dolgozok(4, "Roszik Judit", 6),
            new dolgozok(5, "Leiner Laura", 7),
            new dolgozok(6, "Lakatos Levente", 9),
            new dolgozok(7, "Bálint Áron", 2),
            new dolgozok(8, "Kamaftu Béla", 4),
            new dolgozok(9, "Nagy Dávid", 10),
            new dolgozok(10, "Messzi Mariann", 1),
            new dolgozok(11, "Bal Írisz", 3),
            new dolgozok(12, "Kapu Ákos", 5),
            new dolgozok(13, "Áldott Mára", 7),
            new dolgozok(14, "Hadfi Áron", 8),
            new dolgozok(14, "Lipták Zoltán", 12),
            new dolgozok(14, "Szabó Péter", 5),
            new dolgozok(14, "Gábor Áron", 8),
            new dolgozok(14, "Melkvi Zénó", 4),

    };
    public Vector<dolgozok> workersList = new Vector<>(Arrays.asList(workerArray));

}
