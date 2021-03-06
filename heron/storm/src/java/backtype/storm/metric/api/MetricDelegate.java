// Copyright 2016 Twitter. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package backtype.storm.metric.api;

@SuppressWarnings("rawtypes")
public class MetricDelegate implements com.twitter.heron.api.metric.IMetric {
  private IMetric delegate;

  public MetricDelegate(IMetric delegate) {
    this.delegate = delegate;
  }

  @Override
  public Object getValueAndReset() {
    return delegate.getValueAndReset();
  }
}
