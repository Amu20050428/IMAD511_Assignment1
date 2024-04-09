package com.example.myofficialassignment_imad115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.textView)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..30 -> "Kylian Mbappe"
                    in 30..40 -> "Siya Kolisi"
                    in 40..50 -> "David Beckham"
                    in 50..60 -> "Snoop Dogg"
                    in 60..70 -> "Michael Jordan"
                    in 70..80 -> "Hugh Masekela"
                    in 80..85 -> "Paul McCartney"
                    in 85..90 -> "Roberta Flack"
                    in 90..95 -> "Robert Mugabe"
                    in 95..100 -> "David Attenborough"
                    else -> " Age number bigger than 100 is invalid"
                }
                txtResult.text = "Age: $age\n${
                    when  (result) {
                        "Kylian Mbappe" -> "Kylian Mbappe born and bred in Bondy in France on the 20th of December in the year 1998. He is thee most exciting soccer player in this current era. His attributes such as his pace and skill played a significant role by being scouted to jon the  best youth academy in the wolrd AS Monaco, Mbappe made his professional debut at the age of 16 representing AS Monaco. The starplayer is now with PARIS SAINT GERMAN (PSG). The 25 year old has won the Fifa World Cup with France and being awarded the FIFA young player accolade"
                        "Siya Kolisi" -> " Siya Kolisi born in the Eastern Cape, Port Elizabeth in Zwide a small township.Siya who went to school in  Grey high for boys by obtaining a sports bursary for rugby.Siya Kolisi is the very first black captain for the springboks, and the first captain to win the Rugby World Cup twice in a row."
                        "David Beckham" -> "David Beckham born and raised in Leystone,London in England. David was thee best footbal player in the 2000,s his soccer career started in Manchester United where is career sky rocketed, however football was not the only thing in which he excelled in.Beckham was also a male modeller that had the greatest endorsements due to his high stylish fashion sense. He is the owner of Inter MIami cf a football soccer team in the Major Soccer League (MLS). His humanitarianism and famous status plaed a magnificant role in his life."
                        "Snoop Dogg" -> "Calvin Cordozar Broadus Jr known as Snoop Dogg. Born on October 20th in 1971 in Carlifonia. Snoop is a all rounded talent entertainment star he obtained his fame in the 19890,s with him highlighting the West Coast hip-hop. His regarded as a legend due to his accolades and intergrity in the entertainment industry."
                        "Michael Jordan" -> "Michael Jordan born and bred in Brooklyn,New York. Michael Jordan's career started in the University of North Carlifonia where the drive and passion started in which that later pushed to be selected in the NBA drafts being selected in the chicago bulls.The name AIR-JORDAN played a pat i n his fame as NIKE the brand manufactured shoes called AIR-JORDANS in which they are still in the making.He was one wof ther best NBA players of all time,although he was one of the best players Michael Jordan owns some business adding onto that he has some stakes in Charlotte Hornets."
                        "Hugh Masekela" -> "The late Hugh Masekela born in Witbank,Mpumaanga in South Africa on the 4th of April 1939. Hugh Masekela was not only a Trumpeter a very classical jazz artist but also fought against the struggle of apartheid.Motivated by a movie called  Young man with a horn he therfore started playing with the trumpet.He studied at Guildhall School of music in London where he crafted his talent to make thee greatest jazz artist.He had a number of albums alongside artist that have great aura on music"
                        "Paul McCartney" -> "Born in London.Enlgand on the the 18th of June 1942. Pual McCartney was one of the primary songwriters for the Beatles.After the seperation of the band in 1970 he moved solo.In his new path he partnered up with his wife Linda McCartney.Pual received numerous awards such as your grammy and being listed in hall of fame of Rock and Roll."
                        "Robert Flack" -> "Born in Blacl Mountai, North Carolina in February 1937 on the 10th.Roberta Flack's hits sych as The first time I saw your face played a huge rolw in her career making her win a Grammy award.Se studied in one of the best instutipons Howard University where she studied music where she learned all musical skills.Her influence not only in music but in education showcases the legend that she is and the work that she has done."
                        "Robert Mugabe" -> "Born in Kutuma in February on the 21st in Zimbabwe. Mugabe was one the most longest serving president in which it made him famous and he fought for white colonialsim.He was the president of the ZaNU Party"
                        "Daid Attenborough" -> "Born and Bred in Isleworth,London,May 8 1926.He was if no thee best but thee most influential people in the field of natural history.He served in the Royl Navy in world war 2. His career kickstarted in 1950's in BBC as a producer,presenter and documentary."
                        else -> {}
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age"
            }

            btnCancel.setOnClickListener {
                ageNumber.text.clear()
                txtResult.text = ""
            }
        }
    }
}
