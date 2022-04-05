package ie.dorset.student_22711.moviebookingapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val MovieList : ArrayList<Movie>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = MovieList[position]

        holder.movieImage.setImageResource(currentItem.movieImage)
        holder.movieTitle.text = currentItem.movieTitle
        holder.certification.text = currentItem.certification
        holder.description.text = currentItem.description
        holder.starring.text = currentItem.starring
        holder.runningTime.text = currentItem.runningTime
//        holder.seatsRemaining.text = currentItem.seatsRemaining.toString()
//        holder.seatsSelected.text = currentItem.seatsSelected.toString()

      //  val seatsRemaining = holder.itemView.findViewById<TextView>(R.id.seatsRemaining)
       // val seatsSelected = holder.itemView.findViewById<TextView>(R.id.seatsSelected)

    }


    override fun getItemCount(): Int {

        return  MovieList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val movieImage : ImageView = itemView.findViewById(R.id.movieImage)
        val movieTitle : TextView = itemView.findViewById(R.id.movieTitle)
        val certification : TextView = itemView.findViewById(R.id.certification)
        val description : TextView = itemView.findViewById(R.id.description)
        val starring : TextView = itemView.findViewById(R.id.starring)
        val runningTime : TextView = itemView.findViewById(R.id.runningTime)
//        val seatsRemaining : TextView = itemView.findViewById(R.id.seatsRemaining)
    //      val seatsSelected : TextView = itemView.findViewById(R.id.seatsSelected)

    }
}
