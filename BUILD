
genrule(
    name = "globalweather",
    srcs = ["globalweather.wsdl"], # $<
    outs = ["globalweather.jar"],  # $@
    # Do not use an additional output directory, this confuses bazel more than it does good
    # cmd = "$(location @local_jdk//:wsimport) -clientjar $@ -d $(@D) $<",
    cmd = "$(location @local_jdk//:wsimport) -clientjar $@ $<",
    tools = ["@local_jdk//:wsimport", "@local_jdk//:jdk-default"],
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
