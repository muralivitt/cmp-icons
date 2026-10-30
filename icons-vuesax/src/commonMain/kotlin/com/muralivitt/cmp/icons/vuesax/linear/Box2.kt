package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Box2: ImageVector
    get() {
        if (_Box2 != null) {
            return _Box2!!
        }
        _Box2 = ImageVector.Builder(
            name = "Box2",
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
                moveTo(18.67f, 18.67f)
                lineTo(20.89f, 17.56f)
                verticalLineTo(14.78f)
                moveTo(14.22f, 9.78f)
                lineTo(12f, 10.89f)
                lineTo(14.22f, 9.78f)
                close()
                moveTo(12f, 10.89f)
                lineTo(9.78f, 9.78f)
                lineTo(12f, 10.89f)
                close()
                moveTo(12f, 10.89f)
                verticalLineTo(13.67f)
                verticalLineTo(10.89f)
                close()
                moveTo(20.89f, 6.44f)
                lineTo(18.67f, 7.55f)
                lineTo(20.89f, 6.44f)
                close()
                moveTo(20.89f, 6.44f)
                lineTo(18.67f, 5.33f)
                lineTo(20.89f, 6.44f)
                close()
                moveTo(20.89f, 6.44f)
                verticalLineTo(9.22f)
                verticalLineTo(6.44f)
                close()
                moveTo(14.22f, 3.11f)
                lineTo(12f, 2f)
                lineTo(9.78f, 3.11f)
                horizontalLineTo(14.22f)
                close()
                moveTo(3.11f, 6.44f)
                lineTo(5.33f, 5.33f)
                lineTo(3.11f, 6.44f)
                close()
                moveTo(3.11f, 6.44f)
                lineTo(5.33f, 7.55f)
                lineTo(3.11f, 6.44f)
                close()
                moveTo(3.11f, 6.44f)
                verticalLineTo(9.22f)
                verticalLineTo(6.44f)
                close()
                moveTo(12f, 22f)
                lineTo(9.78f, 20.89f)
                lineTo(12f, 22f)
                close()
                moveTo(12f, 22f)
                lineTo(14.22f, 20.89f)
                lineTo(12f, 22f)
                close()
                moveTo(12f, 22f)
                verticalLineTo(19.22f)
                verticalLineTo(22f)
                close()
                moveTo(5.33f, 18.67f)
                lineTo(3.11f, 17.56f)
                verticalLineTo(14.78f)
                lineTo(5.33f, 18.67f)
                close()
            }
        }.build()

        return _Box2!!
    }

@Suppress("ObjectPropertyName")
private var _Box2: ImageVector? = null
