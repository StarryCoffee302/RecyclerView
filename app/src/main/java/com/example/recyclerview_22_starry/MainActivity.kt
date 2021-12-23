package com.example.recyclerview_22_starry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "Object_Manga"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mangaList = listOf<Manga>(
            Manga(
                R.drawable.gokushufudo,
                "Gokushufudo The Way of House Husband",
                "Gokushufudo bercerita tentang Kehidupan seorang yakuza erat kaitannya dengan dunia hitam yang kelam dan mengerikan." +
                          " Ada seorang yakuza terkuat bernama Tatsu yang dijuluki \"Sang Naga yang Tak Bisa Mati\". Suatu hari, Tatsu menghilang dari dunia yakuza dan memilih kehidupan baru sebagai seorang bapak rumah tangga."),



            Manga(
                R.drawable.lovecatdiary,
                "Junji Ito (Love Cat Diary)",
                "Love Cat diary menceritakan seorang pasangan yang baru pindah ke rumah baru, " +
                          "suatu hari si istrinya membeli 1 atau 2 ekor kucing"
            ),

            Manga(
                R.drawable.tomie,
                "Junji Ito Deluxe Edition (Tomie)",
                "Tomie bercerita tentang perempuan cantik biasa bernama Tomie yang ada di sekolah seperti perempuan cantik pada umumnya. Namun nahas, ada kecelakaan ketika tugas sekolah yang membuat dia meninggal.\n" +
                        "Akan tetapi beberapa minggu kemudian, dia kembali ke sekolah seakan-akan tidak terjadi apa-apa. Mulai dari sini lah kejadian-kejadian aneh mulai terjadi di kota tersebut. " +
                        "Siapakah sebenarnya Tomie dan kenapa dia bisa bangkit lagi?"

            ),

            Manga(
                R.drawable.miiko,
                "Hai, Miiko",
                "Hai Miiko menceritakan tentang keseharian anak SD yang berhubungan dengan keluarga, teman, dan pelajaran di sekolah diangkat dalam seri manga karya Ono Eriko. " +
                          "Yamada Miko merupakan anak kelas lima SD yang ceria, bertubuh mungil, dan memiliki banyak teman."
            ),

            Manga(
                R.drawable.mimi,
                "Junji Ito (Mimi Ghost Stories)",
                "Mimi Ghost Stories Menceritakan tentang seorang gadis yang bernama Mimi yang tinggal bersebelahan dengan wanita yang sangat tinggi, " +
                        "dan juga menutupi kepala sampai kakinya dengan pakaian serba hitam. " +
                        "Mimi semakin penasaran dengan wanita itu, karena dia tidak pernah berbicara atau menanggapi salam Mimi. " +
                        "Suatu hari, Mimi melihat sekilas tubuh wanita itu melalui lubang di antara dinding rumah mereka."
            ),

            Manga(
                R.drawable.remina,
                "Junji Ito (Hell Star Remina)",
                "Hell Star Remina menceritakan tentang seorang professor menemukan sebuah bintang baru yang sangat besar, " +
                        "dia berikan nama sesuai dengan nama anaknya Remina. Setelah itu Remina menjadi sangat terkenal " +
                        "dan diidolakan oleh seluruh rakyat di dunia. Akan tetapi suatu hari bintang yang dinamakan Remina tersebut " +
                        "ternyata setelah diamati adalah makhluk hidup super raksasa yang memakan bintang dan planet lain. " +
                        "Dan bintang tersebut entah kenapa sedang mendekati bumi. "
            ),

            Manga(
                R.drawable.undyinglove,
                "Junji Ito (Undying Love)",
                "Lovesick Dead (juga dikenal sebagai Undying Love) menceritakan tentang" +
                        "Ryuusuke, seorang anak laki-laki yang kembali ke kampung halamannya " +
                        "yang berkabut di Nanchou-shi, menyadari bahwa " +
                        "bentuk uniknya dalam meramal telah menjadi semakin populer sejak dia pergi. " +
                        "Orang-orang akan pergi ke persimpangan jalan dan menutupi wajah mereka, " +
                        "dan meminta orang asing pertama yang lewat untuk menjawab pertanyaan mereka " +
                        "untuk menemukan nasihat dan pelipur lara dalam hidup mereka. Tapi sejak dia pergi, " +
                        "gadis-gadis yang pergi ke persimpangan jalan mulai hancur dan bunuh diri dengan kejam " +
                        "setelah mendengar jawaban."
            ),

            Manga(
                R.drawable.shirayukihime,
                "Junji Ito (Shirayukihime/Snowhite)",
                "Sesuai dengan namanya, Shirayukihime menceritakan tentang Putri Salju yang dilempar ke penjara bawah tanah karena sang ratu iri dengan kecantikannya"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_manga)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MangaAdapter(this, mangaList){

        }
    }
}