package co.tiagoaguiar.netflixremake

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import co.tiagoaguiar.netflixremake.model.Movie

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Loop
        val movies = mutableListOf<Movie>()
        for(i in 0 until 60) {
            val movie = Movie(R.drawable.movie)
            movies.add(movie)
        }

        val adapter = MainAdapter(movies)
        val rv: RecyclerView = findViewById(R.id.rv_main)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }
}