package api

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class AisIndexPostRequest(
    @SerialName("user_name") val userName: String,
)

@kotlinx.serialization.Serializable
data class PlayerSerializable(
    val id: String,
    val name: String,
    val status: String?,
)

@kotlinx.serialization.Serializable
data class RoomSerializable(
    val id: String,
    val black: PlayerSerializable,
    val white: PlayerSerializable,
    val next: PlayerSerializable?,
    val board: List<List<Int>>,
)

@kotlinx.serialization.Serializable
data class RoomShowPostRequest(
    @SerialName("user_id") val userId: String,
    @SerialName("is_user") val isUser: Boolean = false,
    val row: Int,
    val column: Int,
)
