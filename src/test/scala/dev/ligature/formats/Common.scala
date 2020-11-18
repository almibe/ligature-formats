/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.almibe.ligature.formats

import org.almibe.ligature.IRI
import org.almibe.ligature.formats.ntriples.NTriplesSpec
import java.io.InputStreamReader
import java.io.Reader

val stringIRI = IRI("http://www.w3.org/2001/XMLSchema#string")
val spiderMan = IRI ("http://example.org/#spiderman")
val greenGoblin = IRI ("http://example.org/#green-goblin")
val blackCat = IRI("http://example.org/#black-cat")
val enemyOf = IRI ("http://www.perceive.net/schemas/relationship/enemyOf")
val thatSeventiesShow = IRI ("http://example.org/show/218")
val helium = IRI ("http://en.wikipedia.org/wiki/Helium")
val label = IRI ("http://www.w3.org/2000/01/rdf-schema#label")
val localName = IRI ("http://example.org/show/localName")

fun readText(resourcePath: String): Reader {
    return InputStreamReader(NTriplesSpec::class.java.getResourceAsStream(resourcePath))
}
