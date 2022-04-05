package ie.dorset.student_22711.moviebookingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList: ArrayList<Movie>
    lateinit var movieImage : Array<Int>
    lateinit var movieTitle : Array<String>
    lateinit var certification : Array<String>
    lateinit var  description : Array<String>
    lateinit var starring : Array<String>
    lateinit var runningTime : Array<String>
    lateinit var seatsRemaining : Array<Int>
    lateinit var seatsSelected : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieImage = arrayOf(
            R.drawable.ambulance_at_vue_friday,
            R.drawable.batman_carousel,
            R.drawable.the_bad_guys,
            R.drawable.the_worst_person,
            R.drawable.uncharted_carousel_hero
        )

        movieTitle = arrayOf(
            "Ambulance",
            "The Batman",
            "The Bad Guys",
            "The worst person in the world",
            "Uncharted"
        )

        certification = arrayOf(
            "15A",
            "15A",
            "G",
            "16A",
            "12A"
        )

        description = arrayOf(
            getString(R.string.descrip_ambulance),
            getString(R.string.descrip_batman),
            getString(R.string.descrip_badGuys),
            getString(R.string.descrip_worstPerson),
            getString(R.string.descrip_uncharted),
        )

        starring = arrayOf(
            " Director : Michael Bay. Cast :Eiza González,Jake Gyllenhaal,Yahya Abdul-Mateen II",
            "Director : Matt Reeves. Cast: Robert Pattinson, Zoe Kravitz, Paul Dano, Colin Farrell",
            "Director: Pierre Perifel. Cast : Craig Robinson, Marc Maron, Sam Rockwell",
            "Director : Joachim Trier. Cast : Renate Reinsve, Anders Danielsen Lie, Herbert Nerdrum",
            "Director : Ruben Fleischer. Cast : Tom Holland, Mark Wahlberg, Antonio Banderas"
        )

        runningTime = arrayOf(
            " 2hrs 16mins",
            " 2hrs 55mins",
            " 1hr 40mins",
            " 2hrs 8mins",
            " 1hr 56mins"
        )

        seatsRemaining = arrayOf(
            (0..15).random(),
            (0..15).random(),
            (0..15).random(),
            (0..15).random(),
            (0..15).random()
        )
        seatsSelected = arrayOf(
            0,
            0,
            0,
            0,
            0
        )


        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserdata()
    }

    private fun getUserdata(){

        for(i in movieImage.indices){

            val movie_details = Movie(movieImage[i], movieTitle[i], certification[i], description[i],starring[i],runningTime[i]) //, seatsRemaining[i], seatsSelected[i])
            newArrayList.add(movie_details)

        }
        newRecyclerView.adapter = MyAdapter(newArrayList)

    }
}