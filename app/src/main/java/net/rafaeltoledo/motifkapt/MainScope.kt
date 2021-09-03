package net.rafaeltoledo.motifkapt

import motif.Creatable
import motif.Scope

@Scope
interface MainScope: Creatable<MainScope.Dependencies> {

    @motif.Objects
    abstract class Objects {
        fun name(): String = "Eric"
    }

    interface Dependencies {
        fun profile(): Profile
    }
}

data class Profile(
    val name: String,
    val email: String,
)