package ie.dorset.student_22711.moviebookingapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val MovieList : ArrayList<Movie>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = MovieList[position]
        holder.movieImage.setImageResource(currentItem.movieImage)
        holder.movieTitle.text = currentItem.movieTitle
    }


    override fun getItemCount(): Int {

        return  MovieList.size

    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val movieImage : ImageView = itemView.findViewById(R.id.movieImage)
        val movieTitle : TextView = itemView.findViewById(R.id.movieTitle)

    }

}
