package com.chesire.malime.mal.models.response

import com.chesire.malime.mal.models.Entry
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "manga")
data class SearchForMangaResponse(
    @field:ElementList(inline = true, entry = "entry")
    @param:ElementList(inline = true, entry = "entry")
    val entries: List<Entry>
)
