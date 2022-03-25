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
            "Titulo 1",
            "tgghd",
            "kjdkfh",
            "bjhdg",
            "jdfhvhjeb"
        )

//            "Over one day across the streets of L.A., three lives will change forever.",
//            "From Warner Bros. Pictures comes The Batman, with director Matt Reeves at the helm and with Robert Pattinson starring as Gotham City's vigilante detective, Batman.",
//            "In the new action comedy from DreamWorks Animation, based on the New York Times best-selling book series, a crackerjack criminal crew of animal outlaws are about to attempt their most challenging con yet - becoming model citizens.",
//            "The Worst Person In The World revolves around Julie, a vibrant and impulsive young woman who, on the verge of turning thirty, is faced with a series of drastic choices that force her to continually reinvent and pursue new perspectives on her life.",
//            "Street-smart Nathan Drake (Tom Holland) is recruited by seasoned treasure hunter Victor Sully Sullivan (Mark Wahlberg) to recover a fortune amassed by Ferdinand Magellan and lost 500 years ago by the House of Moncada."


//        subHeading = arrayOf(
//
//            " Release date: 25th Mar 2022" +
//                    " Running time: 2hrs 16mins" +
//                    " Director : Michael Bay" +
//                    " Cast :Eiza González,Jake Gyllenhaal,Yahya Abdul-Mateen II",
//            " Release date: 4th Mar 2022" +
//                    "Running time: 2hrs 55mins" +
//                    "Director : Matt Reeves" +
//                    "Cast: Robert Pattinson, Zoe Kravitz, Paul Dano, Colin Farrell",
//            "Release date: 1st Apr 2022" +
//                    "Running time: 1hr 40mins" + "Director: Pierre Perifel" +
//                    "Cast : Craig Robinson, Marc Maron, Sam Rockwell",
//            "Release date: 25th Mar 2022" +
//                    "Running time: 2hrs 8mins" +
//                    "Director : Joachim Trier" +
//                    "Cast : Renate Reinsve, Anders Danielsen Lie, Herbert Nerdrum",
//            "Release date: 11th Feb 2022" +
//                    "Running time: 1hr 56mins" +
//                    "Director : Ruben Fleischer" +
//                    "Cast : Tom Holland, Mark Wahlberg, Antonio Banderas"


        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserdata()
    }

    private fun getUserdata(){

        for(i in movieImage.indices){

            val synopsis = Movie(movieImage[i], movieTitle[i])
            newArrayList.add(synopsis)

        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}