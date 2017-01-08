java_import(
    name = "globalweather",
    jars = [
        "gen/globalweather.jar",
    ],
)


java_test(
    name = "WeatherTest",
    size = "small",
    srcs = glob(["src/test/java/*.java"]),
    deps = [
        "globalweather",
        "junit_junit",
    ],
)

# The following dependencies were calculated from:
# junit:junit:4.12

java_library(
    name = "org_hamcrest_hamcrest_core",
    visibility = ["//visibility:public"],
    exports = [
        "@org_hamcrest_hamcrest_core//jar",
    ],
)

java_library(
    name = "junit_junit",
    visibility = ["//visibility:public"],
    exports = [
        "@junit_junit//jar",
        "@org_hamcrest_hamcrest_core//jar",
    ],
)
