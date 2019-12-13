package non.shahad.quotify.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import non.shahad.quotify.data.entities.ColorEntity

@Dao
interface BackgroundColorDao {
    @Query("SELECT * FROM background_color")
    fun getAllBackgroundColors() : LiveData<List<ColorEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(colorEntity: ColorEntity)

    @Query("SELECT * FROM background_color WHERE id = :id")
    fun findColorById(id : Long) : LiveData<ColorEntity>
}