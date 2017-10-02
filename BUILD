java_binary(
    name = "bugreport",
    srcs = glob(["src/main/**/*.java"]),
    main_class = "bugreport.App",
    deps = [
        "org_modelmapper_modelmapper",
    ]
)

java_library(
    name = "org_modelmapper_modelmapper",
    visibility = ["//visibility:public"],
    exports = [
        "@org_modelmapper_modelmapper//jar",
    ],
)
