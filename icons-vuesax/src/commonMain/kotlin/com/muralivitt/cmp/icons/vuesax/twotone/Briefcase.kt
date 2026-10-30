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

val VuesaxIconsTwotone.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) {
            return _Briefcase!!
        }
        _Briefcase = ImageVector.Builder(
            name = "Briefcase",
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
                moveTo(8.001f, 22f)
                horizontalLineTo(16.001f)
                curveTo(20.021f, 22f, 20.741f, 20.39f, 20.951f, 18.43f)
                lineTo(21.701f, 10.43f)
                curveTo(21.971f, 7.99f, 21.271f, 6f, 17.001f, 6f)
                horizontalLineTo(7.001f)
                curveTo(2.731f, 6f, 2.031f, 7.99f, 2.301f, 10.43f)
                lineTo(3.051f, 18.43f)
                curveTo(3.261f, 20.39f, 3.981f, 22f, 8.001f, 22f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                verticalLineTo(5.2f)
                curveTo(8f, 3.43f, 8f, 2f, 11.2f, 2f)
                horizontalLineTo(12.8f)
                curveTo(16f, 2f, 16f, 3.43f, 16f, 5.2f)
                verticalLineTo(6f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                verticalLineTo(14f)
                curveTo(14f, 14.01f, 14f, 14.01f, 14f, 14.02f)
                curveTo(14f, 15.11f, 13.99f, 16f, 12f, 16f)
                curveTo(10.02f, 16f, 10f, 15.12f, 10f, 14.03f)
                verticalLineTo(13f)
                curveTo(10f, 12f, 10f, 12f, 11f, 12f)
                horizontalLineTo(13f)
                curveTo(14f, 12f, 14f, 12f, 14f, 13f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.65f, 11f)
                curveTo(19.34f, 12.68f, 16.7f, 13.68f, 14f, 14.02f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.619f, 11.269f)
                curveTo(4.869f, 12.809f, 7.409f, 13.74f, 9.999f, 14.03f)
            }
        }.build()

        return _Briefcase!!
    }

@Suppress("ObjectPropertyName")
private var _Briefcase: ImageVector? = null
