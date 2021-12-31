package com.example.myarchive2022.datas

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myarchive2022.utils.MTableName

@Entity(tableName = MTableName)
data class TodoEntity(
    @PrimaryKey(autoGenerate = true) var id_todo: Long? = null,
    var seperatetype_todo: Int = 1,
    //     data==> 1, divide ==> 2 이것은 여기서 관리하나 빠져나가야 할 듯
    var type_todo: Int = 0,    // 0, 할일, 1, 사진, 2, 위치 ()

    var cata1_todo: Int = 0,    // 0 개인, 1 가족, 2 업무, 3 기타
    var cata2_todo: Int = 0,    // 0 일정, 1모임, 2금전, 3메모, 4 기타
    var gravity_todo: Int = 3,  // 0연간, 1월간, 2주간, 3보통, 4메모

    var date_todo: String = "",
    var time_todo: String = "",
    var title_todo: String = "",
    var content_todo: String = "",
    var imageurl_todo: String = "",
    var imageinfo_todo: String = "",
    var locationurl_todo: String = "",
    var locationinfo_todo: String = "",
    var money_todo: Int = 0
)