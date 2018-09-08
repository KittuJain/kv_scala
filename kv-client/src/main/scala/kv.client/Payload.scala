package kv.client

import play.api.libs.json.{Format, Json}

case class Payload[K, V](key: K, value: V) {}

object Payload {
  implicit def format[K: Format, V: Format]: Format[Payload[K, V]] = Json.format[Payload[K, V]]

}
