package net.rafaeltoledo.motifkapt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import motif.ScopeFactory

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainScope = ScopeFactory.create(MainScope::class.java, object: MainScope.Dependencies {
            override fun profile(): Profile = Profile("eric", "noreply@uber.com")
        })
    }
}