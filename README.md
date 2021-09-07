# JMX Exporter for WebSphere AS

A customized [JMX Exporter](https://github.com/prometheus/jmx_exporter) for exporting metrics from
WebSphere Application Server by using [ViualWAS](https://github.com/veithen/visualwas) connector.

## Usage

You have to install VisualWAS WebSphere plugin as described [here](https://github.com/veithen/visualwas#websphere-plugin-installation).

Write your own jmx_exporter configuration file:
```yaml
# Using protocol provided by the VisualWAS project
jmxUrl: service:jmx:soap://localhost:8880
ssl: false
lowercaseOutputName: false
lowercaseOutputLabelNames: false
```

And then run this application as a normal standalone `jmx_exporter`:
```shell
# Listen on 8080 port and using the specified jmx_exporter configuration
java -jar was_exporter-0.0.1-SNAPSHOT.jar 8080 config.yaml
```
