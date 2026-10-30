package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CloudNotif: ImageVector
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
                moveTo(21.9f, 13.96f)
                curveTo(22.17f, 15.63f, 21.7f, 17.42f, 20.27f, 18.68f)
                curveTo(19.28f, 19.59f, 17.98f, 20.09f, 16.63f, 20.08f)
                horizontalLineTo(5.54f)
                curveTo(0.87f, 19.74f, 0.86f, 12.94f, 5.54f, 12.6f)
                horizontalLineTo(5.59f)
                curveTo(3.4f, 6.47f, 9.09f, 2.87f, 13.38f, 4.25f)
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.97f, 8.5f)
                curveTo(21.97f, 9.6f, 21.46f, 10.59f, 20.65f, 11.23f)
                curveTo(20.06f, 11.71f, 19.29f, 12f, 18.47f, 12f)
                curveTo(16.54f, 12f, 14.97f, 10.43f, 14.97f, 8.5f)
                curveTo(14.97f, 7.54f, 15.36f, 6.67f, 16f, 6.04f)
                verticalLineTo(6.03f)
                curveTo(16.63f, 5.39f, 17.51f, 5f, 18.47f, 5f)
                curveTo(20.4f, 5f, 21.97f, 6.57f, 21.97f, 8.5f)
                close()
            }
        }.build()

        return _CloudNotif!!
    }

@Suppress("ObjectPropertyName")
private var _CloudNotif: ImageVector? = null
