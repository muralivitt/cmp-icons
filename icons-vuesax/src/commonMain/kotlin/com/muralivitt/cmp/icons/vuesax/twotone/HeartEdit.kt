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

val VuesaxIconsTwotone.HeartEdit: ImageVector
    get() {
        if (_HeartEdit != null) {
            return _HeartEdit!!
        }
        _HeartEdit = ImageVector.Builder(
            name = "HeartEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.49f, 12f)
                curveTo(21.81f, 10.98f, 22f, 9.88f, 22f, 8.69f)
                curveTo(22f, 5.6f, 19.51f, 3.1f, 16.44f, 3.1f)
                curveTo(14.62f, 3.1f, 13.01f, 3.98f, 12f, 5.34f)
                curveTo(10.99f, 3.98f, 9.37f, 3.1f, 7.56f, 3.1f)
                curveTo(4.49f, 3.1f, 2f, 5.6f, 2f, 8.69f)
                curveTo(2f, 15.69f, 8.48f, 19.82f, 11.38f, 20.82f)
                curveTo(11.55f, 20.88f, 11.77f, 20.91f, 12f, 20.91f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.209f, 15.74f)
                lineTo(15.669f, 19.28f)
                curveTo(15.529f, 19.42f, 15.399f, 19.68f, 15.369f, 19.87f)
                lineTo(15.179f, 21.22f)
                curveTo(15.109f, 21.71f, 15.449f, 22.05f, 15.939f, 21.98f)
                lineTo(17.289f, 21.79f)
                curveTo(17.479f, 21.76f, 17.749f, 21.63f, 17.879f, 21.49f)
                lineTo(21.419f, 17.95f)
                curveTo(22.029f, 17.34f, 22.319f, 16.63f, 21.419f, 15.73f)
                curveTo(20.529f, 14.84f, 19.819f, 15.13f, 19.209f, 15.74f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.699f, 16.25f)
                curveTo(18.999f, 17.33f, 19.839f, 18.17f, 20.919f, 18.47f)
            }
        }.build()

        return _HeartEdit!!
    }

@Suppress("ObjectPropertyName")
private var _HeartEdit: ImageVector? = null
