package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.CloudNotif: ImageVector
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
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.272f, 8.762f)
                curveTo(21.272f, 9.782f, 20.802f, 10.702f, 20.042f, 11.302f)
                curveTo(19.492f, 11.752f, 18.782f, 12.022f, 18.012f, 12.022f)
                curveTo(16.222f, 12.022f, 14.762f, 10.562f, 14.762f, 8.772f)
                curveTo(14.762f, 7.882f, 15.122f, 7.072f, 15.722f, 6.482f)
                verticalLineTo(6.472f)
                curveTo(16.312f, 5.882f, 17.122f, 5.512f, 18.012f, 5.512f)
                curveTo(19.812f, 5.512f, 21.272f, 6.972f, 21.272f, 8.762f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.182f, 18.729f)
                curveTo(19.132f, 19.689f, 17.782f, 20.219f, 16.352f, 20.219f)
                horizontalLineTo(5.972f)
                curveTo(3.232f, 20.019f, 2.012f, 17.909f, 2.012f, 16.029f)
                curveTo(2.012f, 14.349f, 2.982f, 12.489f, 5.112f, 11.969f)
                curveTo(4.182f, 8.389f, 5.962f, 5.889f, 8.042f, 4.699f)
                curveTo(10.102f, 3.529f, 13.002f, 3.339f, 15.182f, 4.949f)
                curveTo(14.992f, 5.089f, 14.822f, 5.239f, 14.652f, 5.409f)
                lineTo(14.222f, 5.859f)
                verticalLineTo(5.919f)
                curveTo(13.602f, 6.729f, 13.262f, 7.719f, 13.262f, 8.759f)
                curveTo(13.262f, 11.379f, 15.402f, 13.509f, 18.022f, 13.509f)
                curveTo(19.102f, 13.509f, 20.152f, 13.139f, 20.972f, 12.469f)
                curveTo(21.122f, 12.349f, 21.272f, 12.219f, 21.402f, 12.079f)
                curveTo(22.392f, 14.159f, 22.252f, 16.919f, 20.182f, 18.729f)
                close()
            }
        }.build()

        return _CloudNotif!!
    }

@Suppress("ObjectPropertyName")
private var _CloudNotif: ImageVector? = null
