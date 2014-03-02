/*
 * -----------------------------------------------------------------------
 * Copyright © 2013 Meno Hochschild, <http://www.menodata.de/>
 * -----------------------------------------------------------------------
 * This file (IsoUnit.java) is part of project Time4J.
 *
 * Time4J is free software: You can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Time4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Time4J. If not, see <http://www.gnu.org/licenses/>.
 * -----------------------------------------------------------------------
 */

package net.time4j;

import net.time4j.engine.ChronoUnit;


/**
 * <p>Repr&auml;sentiert eine f&uuml;r aus Datum und Uhrzeit zusammengesetzte
 * ISO-konforme Zeitstempel geeignete Zeiteinheit. </p>
 *
 * @author  Meno Hochschild
 */
public interface IsoUnit
    extends ChronoUnit {

    //~ Methoden ----------------------------------------------------------

    /**
     * <p>Liefert das Formatsymbol, mit dem diese Instanz in kanonischen
     * Darstellungen von Zeitspannen repr&auml;sentiert wird. </p>
     *
     * <p>Kanonische Zeitspannenformate folgen dem ISO-Standard. Zum Beispiel
     * wird der Tag durch den Buchstaben D repr&auml;sentiert. Zu beachten ist,
     * da&szlig; die Buchstaben P und T hier nicht verwendet werden d&uuml;rfen,
     * da sie die Darstellung strukturieren. Im ISO-8601-Format gilt: </p>
     *
     * <ul>
     *  <li>Y - Jahr (engl.: <i>year</i>)</li>
     *  <li>M - Monat oder Minute (engl.: <i>month or minute</i>)</li>
     *  <li>W - Woche (engl.: <i>week</i>)</li>
     *  <li>D - Tag (engl.: <i>day</i>)</li>
     *  <li>H - Stunde (engl.: <i>hour</i>)</li>
     *  <li>S - Sekunde (engl.: <i>second</i>)</li>
     *  <li>P - Qualifiziert eine Zeitspanne (englisch: <i>period</i>)</li>
     *  <li>T - Trennt Datums- und Uhrzeitanteil</li>
     * </ul>
     *
     * <p>Liefert die Methode als Sonderfall eine Ziffer 1-9, dann erwartet
     * Time4J eine fraktionale Anzeige der vorangehenden Sekundenzeiteinheit S,
     * also Nanos, Mikros und Millisekunden. Als Dezimaltrennzeichen wird in
     * der kanonischen Darstellung wie im ISO-8601-Standard empfohlen dann das
     * Komma verwendet, es sei denn, &uuml;ber das Setzen der System-Property
     * &quot;net.time4j.format.iso.decimal.dot&quot; auf den Wert {@code true}
     * wurde ein Punkt verlangt. </p>
     *
     * @return  char (ASCII-NULL wenn undefiniert)
     * @see     Duration#toString()
     */
    char getSymbol();

}
