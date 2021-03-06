SUMMARY = "Provides a small set of tools for development on the device"
LICENSE = "MIT"

PR = "r1"

inherit packagegroup

RPROVIDES_${PN} = "qemu-config"
RREPLACES_${PN} = "qemu-config"
RCONFLICTS_${PN} = "qemu-config"

RDEPENDS_${PN} = "\
    distcc-config \
    oprofileui-server \
    nfs-export-root \
    bash \
    "

