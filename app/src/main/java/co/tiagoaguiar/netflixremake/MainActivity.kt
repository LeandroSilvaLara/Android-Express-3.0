package co.tiagoaguiar.netflixremake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import co.tiagoaguiar.netflixremake.model.Category
import co.tiagoaguiar.netflixremake.model.CategoryAdapter
import co.tiagoaguiar.netflixremake.model.Movie

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // list vertical
        // cat 1
            // listas h-> - f1 -f2 -f4...
        // cat 2
            // listas h-> -f1 -f2 -f3 -f4...

        val categories = mutableListOf<Category>()
        for  (j in 0 until 10) {
            //Loop
            val movies = mutableListOf<Movie>()
            for(i in 0 until 15) {
                val movie = Movie(R.drawable.movie)
                movies.add(movie)
            }
            val category = Category("cat $j", movies)
            categories.add(category)
        }



        // Rolagem das tela na horizontal
        // na vertical a lista (MainAdapter) de categorias
        // (cada categoria) teremos
        // uma lista (MovieAdapter) de filmes (ImageView)
        val adapter = CategoryAdapter(categories)
        val rv: RecyclerView = findViewById(R.id.rv_main)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }
}