package com.example.pecatars.sample

import com.example.pecatars.model.PackingItem
import com.example.pecatars.model.PackingList

object SampleData {
    val packingLists = listOf(
        PackingList(1, "Method feeder", items = listOf(
            PackingItem(1, "Bot", false),
            PackingItem(2, "Orsó", false),
            PackingItem(3, "Rod-Pod", false),
            PackingItem(4, "Táska", false),
            PackingItem(5, "Haltartó", false),
            PackingItem(6, "Merítő nyél", false),
            PackingItem(7, "Merítő fej", false),
            PackingItem(8, "Etetőanyag", false),
            PackingItem(9, "Szék", false)
        )),
        PackingList(2, "Úszós peca", items = emptyList()),
        PackingList(3, "Pergetés", items = emptyList())
    )
}