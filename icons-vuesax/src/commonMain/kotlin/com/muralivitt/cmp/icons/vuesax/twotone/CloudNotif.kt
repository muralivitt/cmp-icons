package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.CloudNotif: ImageVector
    get() {
        if (_CloudNotif != null) {
            return _CloudNotif!!
        }
        _CloudNotif = ImageVector.Builder(
            name = "CloudNotif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.899f, 13.96f)
                curveTo(22.17f, 15.63f, 21.699f, 17.42f, 20.27f, 18.68f)
                curveTo(19.279f, 19.59f, 17.979f, 20.09f, 16.629f, 20.08f)
                horizontalLineTo(5.539f)
                curveTo(0.869f, 19.74f, 0.859f, 12.94f, 5.539f, 12.6f)
                horizontalLineTo(5.589f)
                curveTo(3.399f, 6.47f, 9.089f, 2.87f, 13.38f, 4.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.26f, 13.01f)
                curveTo(6.74f, 12.75f, 6.17f, 12.61f, 5.59f, 12.6f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.971f, 8.5f)
                curveTo(21.971f, 9.6f, 21.461f, 10.59f, 20.651f, 11.23f)
                curveTo(20.061f, 11.71f, 19.291f, 12f, 18.471f, 12f)
                curveTo(16.541f, 12f, 14.971f, 10.43f, 14.971f, 8.5f)
                curveTo(14.971f, 7.54f, 15.361f, 6.67f, 16.001f, 6.04f)
                verticalLineTo(6.03f)
                curveTo(16.631f, 5.39f, 17.511f, 5f, 18.471f, 5f)
                curveTo(20.401f, 5f, 21.971f, 6.57f, 21.971f, 8.5f)
                close()
            }
        }.build()

        return _CloudNotif!!
    }

@Suppress("ObjectPropertyName")
private var _CloudNotif: ImageVector? = null
