package jp.techacademy.nasahiro.kotlinlog1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス
        val dog = Animal("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()  // ポチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val dog2 = Animal("ハチ", 10)    // 名前をハチ、年齢10歳で、Dogインスタンスを作る
        dog2.say()  // ハチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")
    }
}