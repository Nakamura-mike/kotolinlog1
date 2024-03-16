package jp.techacademy.nasahiro.kotlinlog1

import android.util.Log

class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // メソッド
    fun say() {
        Log.d("kotlintest1", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}